# Task: “DAO (Data Access Object) Layer”

## Description

Let's practice working with Spring JDBC while reinforcing topics we have already covered.

You need to write an application for working with a database using the scripts you wrote when completing [the second task](https://github.com/netology-code/jd-homeworks/blob/master/sql-agg/task/README.md).

**Step 1.** Create a Spring Boot application with dependencies on two starters — `spring-boot-starter-jdbc` and `spring-boot-starter-web`.

**Step 2.** Move the table creation script to the `schema.sql` file so that Spring Boot automatically creates the table.

**Step 3.** Move the query script from the second task to the `resources` folder. Rewrite the script so that it returns `product_name` for the named parameter `name` (and not just for `alexey`), which you will pass to the `NamedParameterJdbcTemplate` script execution methods along with the query script.

**Step 4.** Write a repository for working with the database.

- Create a class and mark it with the Repository annotation, or create a repository bean in the Java Config class.
- Add a String field to the class that contains the content of your script. You can read the content itself using the code below. You will need to pass the name of your script, located in the `resources` folder, to the `read` method. For example: `read(myScript.sql)`.
- Create a method `getProductName(String name)` that will accept a name and return the product name from the database.

```java
private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining(“\n”));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
``` 

**Step 5.** Write a controller with a GET request handler method mapped to the endpoint `/products/fetch-product`. The query params of the request will contain a string parameter `name`, which you will need to pass on to the repository. That is, your method must be able to handle a request of the form `localhost:8080/products/fetch-product?name=Ivan`.
The controller will need to return the product name it receives from the repository.
