
#actual suluion:

#procedure 1

animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

def checkanimal(name):
    for animal in animals:
        if animal == name:
            print(f'{name} is in the list')
            return
    print(f'{name} is not in the list')

checkanimal("cat")
checkanimal("penguin")

#procedure 2

