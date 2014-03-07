def checkio(array):
    """
        sums even-indexes elements and multiply at the last
    """
    if len(array)==0:
        return 0 
    
    result = 0
    
    jz = array[-1]
    
    seq = array[::2]
    print (seq)
    for ele in seq:
        result = result + ele
    return jz*result

 
#These "asserts" using only for self-checking and not necessary for auto-testing
if __name__ == '__main__':
    assert checkio([0, 1, 2, 3, 4, 5]) == 30, "(0+2+4)*5=30"
    assert checkio([1, 3, 5]) == 30, "(1+5)*5=30"
    assert checkio([6]) == 36, "(6)*6=36"
    assert checkio([]) == 0, "Empty"