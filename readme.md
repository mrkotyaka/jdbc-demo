# Task “Two tables with Hibernate*” (task with an asterisk)

## Description

This task is optional; completing it does not affect your grade.

Let's rewrite the application from [Task “DAO (Data Access Object) Layer”](https://github.com/mrkotyaka/jdbc-demo/blob/main/readme.md) to Hibernate.

1. You need to write two `Entity`s corresponding to the two tables from the assignment. Keep in mind that you need to correctly choose the relationship logic for these `Entity`s: `OneToOne`, `OneToMany`, `ManyToOne`, `ManyToMany`.

2. Rewrite the repository so that it works with `EntityManager` instead of `NamedParameterJdbcTemplate`.
