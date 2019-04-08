from slackbot.bot import default_reply

@default_reply()
def mentaion_func(message):
    message.reply(message.body['text'] + "をショッピングリストに追加しました")
