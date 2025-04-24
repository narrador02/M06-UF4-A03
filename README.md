# Actividad A03 UF4: La API de la tienda (Uso de DTOs)

## Descripción del proyecto

Esta actividad consiste en transformar una aplicación web de tienda en una **API REST**, utilizando buenas prácticas modernas de desarrollo, como:

- Uso de DTOs para encapsular datos y evitar exponer las entidades directamente
- Conversión entre entidades y DTOs mediante MapStruct
- Separación en capas (modelo, servicio, repositorio, controlador)
- Documentación y pruebas de endpoints usando Swagger

---

## Estructura del proyecto

```
src/
├── controller/              → WebController y RESTBotigaController
├── dto/                     → DTOs: ProductDTO, CategoriaDTO, SubcategoriaDTO
├── mapper/                  → MapStruct mappers para cada entidad
├── model/                   → Entidades: Product, Categoria, Subcategoria
├── repository/              → Repositorios JPA
├── service/                 → BotigaService + Implementaciones
└── BotigaApplication.java   → Clase principal
```

---

## URL de prueba

Puedes acceder a la documentación de la API en:

```
http://localhost:8081/swagger-ui-custom.html
```

---

## Pruebas de endpoints con Swagger

### Insertar categoría

**`POST /api/botiga/inserirCategoria`**

```json
{
  "descCategoria": "Ejemplo",
  "statusCategoria": "Activa"
}
```


---

### Insertar subcategoría

**`POST /api/botiga/inserirSubcategoria`**

```json
{
  "descSubcategoria": "Shonen",
  "statusSubcategoria": "Activa",
  "categoria": { "idCategoria": 1 }
}
```

---

### Insertar producto

**`POST /api/botiga/inserirProducte`**

```json
{
  "nom": "Naruto Vol. 1",
  "preu": 9.99,
  "descripcio": "Volumen de prueba",
  "categoria": { "idCategoria": 1 },
  "subcategoria": { "idSubcategoria": 1 }
}
```

---

### Listar productos

**`GET /api/botiga/llistarProductes`**

---

### Buscar producto por nombre

**`GET /api/botiga/cercaProductes?nom=Naruto`**

---

### Modificar precio

**`PUT /api/botiga/modificarPreu?id=1&nouPreu=12.5`**


---

## Endpoints adicionales implementados

1. **`GET /api/botiga/productsPerSubcategoria?idSubcategoria=1`**
   → Muestra todos los productos que pertenecen a una subcategoría concreta.

2. **`GET /api/botiga/preuMig`**
   → Calcula el precio medio de todos los productos.

3. **`DELETE /api/botiga/esborrarCategoria/{id}`**
   → Elimina una categoría por su ID.


---

## Reflexión final

Con esta práctica he aprendido a crear una API REST profesional en Java con Spring Boot, organizando el proyecto por capas y utilizando DTOs para controlar la información que se envía y recibe. También he entendido cómo usar MapStruct para automatizar la conversión entre entidades y DTOs, y cómo probar todos los endpoints fácilmente con Swagger.

---

## Repositorio GitHub

[https://github.com/narrador02/M06-UF4-A03](https://github.com/narrador02/M06-UF4-A03)
