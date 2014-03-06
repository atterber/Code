def checkio(words):
    count=0
    
    word=words.split()
    for ele in word:
        if ele.isdigit():
            count=0
        else:
            count = count + 1
            if count == 3 or count > 3:
                return True
                
    if count < 3:
        return False
  

#These "asserts" using only for self-checking and not necessary for auto-testing
if __name__ == '__main__':
    assert checkio("Hello World hello") == True, "Hello"
    assert checkio("He is 123 man") == False, "123 man"
    assert checkio("1 2 3 4") == False, "Digits"
    assert checkio("bla bla bla bla") == True, "Bla Bla"
    assert checkio("Hi") == False, "Hi"
