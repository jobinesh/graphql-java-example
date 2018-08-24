>>mvn jetty:run

Above opertaion starts server
Now open browser and try: localhost:8080

Introspection
-------------

{
  __schema {
    types {
      name
      description
      kind
    }
  }
}



{
  __type(name: "Query") {
    name
    fields {
      name
      args {
        name
        type {
          kind
          name
          ofType {
            name
          }
        }
      }
    }
  }
}



