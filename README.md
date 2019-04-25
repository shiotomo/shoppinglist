# shoppinglist

## このシステムについて

Web上で物品を管理することができる物品管理システムです。  
Webから商品の登録、更新、削除を行うことができます。  
また、Slackからも商品の登録を行えます。  
管理している商品はCSVファイルに出力することも可能です。  

## 使い方

使い方は[usage.md](https://github.com/shiotomo/shoppinglist/blob/master/usage.md)を参照してください。

## 使用技術

- Java8
  - Spring Boot2
  - JPA
  - Flyway
- Python3.7
  - slackBot
  - SQLAlchemy
- MySQL5.7
- Docker
- Docker Compose

## 運用方法

まず、`README.md` と同じディレクトリにある `.env` 、webフォルダ内の `application-product.yml` 、botフォルダ内の `.env` の設定を行います。

`.env`
```
MYSQL_DATABASE=ここに利用するMySQLのデータベース名を記述
MYSQL_USERNAME=ここに利用するMySQLのユーザ名を記述
MYSQL_PASSWORD=ここに利用するMySQLのパスワードを記述
MYSQL_ROOT_PASSWORD=ここにMySQLのルートユーザのパスワードを入力
```

### web

`web/src/main/resources/application-product.yml`
```
spring:
  datasource:
    url: ここに利用するMySQLのURLを記述
    username: ここに利用するMySQLのユーザ名を記述
    password: ここに利用するMySQLのパスワードを記述
    driverClassName: com.mysql.jdbc.Driver
  security:
    user:
      name: 管理者名をここに記述(好きな管理者名にしてください)
      password: 管理者パスワードを記述
      roles: ADMIN
```

### bot

`bot/.env`
```
SLACK_API_TOKEN=ここに利用するSlackAPIのTokenを記述
MYSQL_URL=ここに利用するMySQLのURLを記述
MYSQL_USERNAME=ここに利用するMySQLのユーザ名を記述
MYSQL_PASSWORD=ここに利用するMySQLのパスワードを記述
MYSQL_DATABASE=ここに利用するMySQLのデータベース名を記述
```

設定後以下のコマンドを入力することで起動することができます。

```
docker-compose build
docker-compose up
```

## 備考

初めて `docker-compose up`を実行した際webコンテナでエラーが発生する場合があります。  
その場合は改めて `docker-compose up` を実行することでエラーを解消できます。
