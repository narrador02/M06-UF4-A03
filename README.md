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
  "descCategoria": "Acción",
  "statusCategoria": "Activa"
}
```
![image](https://github.com/user-attachments/assets/ce0a1921-be42-4624-8cd7-79074796ebbb)



---

### Insertar subcategoría

**`POST /api/botiga/inserirSubcategoria`**

```json
{
  "descSubcategoria": "Pelea callejera",
  "statusSubcategoria": "Activa",
  "categoria": { "idCategoria": 3 }
}
```
![image](https://github.com/user-attachments/assets/22b8c242-7572-4672-bdf7-bc74fe9e476b)

---

### Insertar producto

**`POST /api/botiga/inserirProducte`**

```json
{
  "nom": "Batman Returns",
  "preu": 14.99,
  "descripcio": "Segunda edición",
  "idCategoria": 1,
  "idSubcategoria": 1
}
```
![image](https://github.com/user-attachments/assets/81c743c4-709f-420f-9a16-688dfb02ef26)

---

### Listar productos

**`GET /api/botiga/llistarProductes`**
![image](https://github.com/user-attachments/assets/9eecdefd-d065-4cd8-a8ae-1ec0ef4d01a9)

---

### Buscar producto por nombre

**`GET /api/botiga/cercaProductes?nom=Batman Returns`**
![image](https://github.com/user-attachments/assets/e0f7b4fc-c22d-44db-9adb-4ccf8db75c19)

---

### Modificar precio

**`PUT /api/botiga/modificarPreu?id=2&nouPreu=16`**
![image](https://github.com/user-attachments/assets/5d6dd555-56e1-4d00-a1f2-ae85da434e7c)

---

## Endpoints adicionales implementados

1. **`GET /api/botiga/productsPerSubcategoria?idSubcategoria=1`**
   → Muestra todos los productos que pertenecen a una subcategoría concreta.
![image](https://github.com/user-attachments/assets/ec0905a2-8467-40af-8c80-43659cfaea26)

2. **`GET /api/botiga/preuMig`**
   → Calcula el precio medio de todos los productos.
![image](https://github.com/user-attachments/assets/5b3971b5-4960-481d-8c53-0d226ef091fa)

3. **`DELETE /api/botiga/esborrarCategoria/{id}`**
   → Elimina una categoría por su ID.
![image](https://github.com/user-attachments/assets/c317d613-7692-4ac1-b264-0e29b7ee61b5)

---

## Reflexión final

Con esta práctica hemos aprendido a crear una API REST profesional en Java con Spring Boot, organizando el proyecto por capas y utilizando DTOs para controlar la información que se envía y recibe. También hemos entendido cómo usar MapStruct para automatizar la conversión entre entidades y DTOs, y cómo probar todos los endpoints fácilmente con Swagger.

---
Daniel Dans y Jairo Vigil - DAM2A

## Repositorio GitHub

[https://github.com/narrador02/M06-UF4-A03](https://github.com/narrador02/M06-UF4-A03)
