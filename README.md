# API Spec

## Authentication

All API must use this authentication

Request :
- Header :
  - X-Api-Key : "your secret api key"

## Create Product

Request:

- Method: POST
- Endpoint: `/api/products`
- Headers:
    - Content-Type: application/json
    - Accept: application/json
- Body:
    - id = String, Unique
    - name = String
    - price = long,
    - quantity = integer

```json
{
  "id": "chicken-broth",
  "name": "Chicken Broth",
  "price": 15000,
  "quantity": 3
}
```

- Response:
    - id = String, Unique
    - name = String
    - price = long
    - quantity = integer
    - createdAt = long (date)
    - updatedAt = long (date)

```json
{
  "code": 200,
  "status": "Success",
  "data": {
    "id": "chicken-broth",
    "name": "Chicken Broth",
    "price": 15000,
    "quantity": 3,
    "createdAt": 16212391239,
    "updatedAt": null
  }
}
```

## Get Product

Request:

- Method: GET
- Endpoint: `/api/products/{id_product}`
- Headers:
    - Accept: application/json
- Response:
    - id = String, Unique
    - name = String
    - price = long
    - quantity = integer
    - createdAt = long (date)
    - updatedAt = long (date)

```json
{
  "code": 200,
  "status": "Success",
  "data": {
    "id": "chicken-broth",
    "name": "Chicken Broth",
    "price": 15000,
    "quantity": 3,
    "createdAt": 16212391239,
    "updatedAt": 16212391239
  }
}
```

## Update Product

Request:

- Method: PUT
- Endpoint: `/api/products/{id_product}`
- Headers:
    - Content-Type: application/json
    - Accept: application/json
- Body:
    - name = String
    - price = long,
    - quantity = integer

```json
{
  "name": "Chicken Broth",
  "price": 15000,
  "quantity": 3
}
```

- Response:
    - id = String, Unique
    - name = String
    - price = long
    - quantity = integer
    - createdAt = long (date)
    - updatedAt = long (date)

```json
{
  "code": 200,
  "status": "Success",
  "data": {
    "id": "chicken-broth",
    "name": "Chicken Broth",
    "price": 15000,
    "quantity": 3,
    "createdAt": 16212391239,
    "updatedAt": 16212391239
  }
}
```

## List Products
Request:
- Method: GET
- Endpoint: `/api/products`
- Headers:
  - Accept: application/json
- Query Parameter(s):
  - size: integer,
  - page: integer
- Response:

```json
{
  "code": 200,
  "status": "Success",
  "data": [
    {
      "id": "chicken-broth",
      "name": "Chicken Broth",
      "price": 15000,
      "quantity": 3,
      "createdAt": 16212391239,
      "updatedAt": 16212391239
    },
    {
      "id": "chicken-broth",
      "name": "Chicken Broth",
      "price": 15000,
      "quantity": 3,
      "createdAt": 16212391239,
      "updatedAt": 16212391239
    },
    {
      "id": "chicken-broth",
      "name": "Chicken Broth",
      "price": 15000,
      "quantity": 3,
      "createdAt": 16212391239,
      "updatedAt": 16212391239
    }
  ]
}
```


## Delete Product
Request:
- Method: DELETE
- Endpoint: `/api/products/{id_product}`
- Headers:
    - Accept: application/json
- Response:

```json
{
  "code": 200,
  "status": "Success"
}
```


