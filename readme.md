# Задача «Две таблицы с Hibernate*» (задача со звёздочкой)

## Описание

Эта задача необязательная, её выполнение не влияет на получение зачёта.

Перепишем приложение из [Задача «Слой DAO (Data Access Object)»](https://github.com/mrkotyaka/jdbc-demo/blob/main/readme.md) на Hibernate.

1. Нужно написать две `Entity`, соответствующие двум таблицам из задания. Учтите, что вам надо верно выбрать логику отношений этих `Entity`: `OneToOne`, `OneToMany`, `ManyToOne`, `ManyToMany`.

2. Перепишите репозиторий, чтобы он работал с `EntityManager`, а не через `NamedParameterJdbcTemplate`.