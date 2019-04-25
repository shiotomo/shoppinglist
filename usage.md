# shoppinglist取扱説明書

ここではshoppinglistの使い方について簡単に説明をまとめておきます。

## webの取り扱いについて

このshoppinglistはWebアプリケーションのみでの運用も可能です。  
docker-composeを用いて起動する際、webとdbのみを指定して立ち上げることでWebベースのみでの運用が可能となります。  

## botの取り扱いについて

SlackBotの取り扱いについてです。
登録したBotにダイレクトメッセージを送るか、チャンネルにBotを追加し、メンションをつけてメッセージを送ると
__送ったメッセージがそのまま__
shoppinglistに追加されます。
