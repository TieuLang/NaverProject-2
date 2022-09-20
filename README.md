# NaverProject-2

- Request: `GET http://localhost:8765/currency-converter/from/USD/to/VND/quantity/100`
- Response:
  ```
    {
        "id":10001,
        "from":"USD",
        "to":"VND",
        "conversionMultiple":23300.00,
        "quantity":100,"port":8000,
        "totalCalculatedAmount":2330000.00
     }
      
     {
        "id":10001,
        "from":"USD",
        "to":"VND",
        "conversionMultiple":23300.00,
        "quantity":100,
        "port":8001,
        "totalCalculatedAmount":2330000.00
      }
   ```
- Request: `GET http://localhost:8765/currency-converter-feign/from/EUR/to/VND/quantity/100`
- Response:
 ```
    {
        "id":10002,
        "from":"EUR",
        "to":"VND",
        "conversionMultiple":23800.00,
        "quantity":100,
        "port":8000,
        "totalCalculatedAmount":2380000.00
    }
    
    {
        "id":10002,
        "from":"EUR",
        "to":"VND",
        "conversionMultiple":23800.00,
        "quantity":100,"port":8000,
        "totalCalculatedAmount":2380000.00
    }
```
