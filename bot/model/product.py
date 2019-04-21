class Product():
    def __init__(number, name, status, created_at, updated_at):
        self.number = number
        self.name = name
        self.status = status
        self.created_at = created_at
        self.updated_at = updated_at

    def get_id():
        return self.number

    def get_name():
        return self.name

    def get_status():
        return self.status

    def get_created_at():
        return self.created_at

    def get_updated_at():
        return self.updated_at

    def set_id(number):
        self.number = number

    def set_name(name):
        self.name = name

    def set_status(status):
        self.status = status

    def set_created_at(created_at):
        self.created_at = created_at

    def set_updated_at(updated_at):
        self.updated_at = updated_at
