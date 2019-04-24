from slackbot.bot import default_reply
from service.product_service import ProductService

product_service = ProductService()

@default_reply()
def mentaion_func(message):
    product_service.insert(message.body['text'])
    message.reply(message.body['text'] + "をショッピングリストに追加しました")
