# ==== Shopping List Slack Bot ====
#
# ShoppingListをSlackから扱うためのBotです。
#
# 現在搭載機能
# - Slackから商品を追加する

from slackbot.bot import Bot

# Botをスタートするメソッド
def main():
    bot = Bot()
    bot.run()

if __name__ == "__main__":
    print("Start shopping list bot !!")
    main()
