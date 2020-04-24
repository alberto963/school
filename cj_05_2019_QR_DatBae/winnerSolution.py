"""
Note: needs python 2.7 (used 2.7.18)
"""
import sys
"""
raw_input() function is used to accept user input.
It presents a prompt to the user, gets input from the user and returns the data input by the user in a string.
"""
"""
The int() function converts the specified value into an integer number. 
The int() function returns an integer object constructed from a number or string x, or return 0 if no arguments are given.
A number or string to be converted to integer object. 
Default argument is zero.
"""
t = int(raw_input())

def solve():
	
    """
	The split() method splits a string into a list.
	You can specify the separator, default separator is any whitespace.
	Note: When maxsplit is specified, the list will contain the specified number of elements plus one.

	The map() function executes a specified function for each item in a iterable.
	The item is sent to the function as a parameter.

    ...Here it reads three params n b and f from the std in converting them from string to int
    """ 
    n,b,f = map(int, raw_input().split())

    """
    =================================================================================================
    Generate TEST_STORE sequences of bits.
    =================================================================================================

    The xrange() function in Python is used to generate a sequence of numbers, similar to the range() function.
    However, xrange() is used only in Python 2.x whereas range() is used in Python 3.x.
    """
    """
    Generates a matrix with all values iniyialized to 0: for n=10 and f=2 it generates:

    [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
    """
    nb = [[0 for __ in xrange(n)] for ___ in xrange(f)]
    #print nb
    for col in xrange(n):
        """
        & bitwise AND operator

        Generates all blocks of numbers from 0 to 31 (es: for n=40 0,1,..31,0,1,...7)
        31 binary is 11111 i.e. 5 1s
        """
        r = col & 31
   
        """
        r >> row
        Returns r with the bits shifted to the right by row places.
        (r>>row)&1 is a bitwise operation, it gives 1 for odd numbers, 0 for even numbers
        For all the f columns and for every row

        Example: col=0 or 32 or 64 ... => r=0, col=0, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=1 or 33 or 65 ... => r=1, col=0, => r>>col = 1 => (r>>col)&1 = 1
        Example: col=2 or 34 or 66 ... => r=2, col=0, => r>>col = 2 => (r>>col)&1 = 0
        Example: col=3 or 35 or 67 ... => r=3, col=0, => r>>col = 3 => (r>>col)&1 = 1

        Example: col=0 or 32 or 64 ... => r=0, col=1, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=1 or 33 or 65 ... => r=1, col=1, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=2 or 34 or 66 ... => r=2, col=1, => r>>col = 1 => (r>>col)&1 = 1
        Example: col=3 or 35 or 67 ... => r=3, col=1, => r>>col = 1 => (r>>col)&1 = 1

        Example: col=0 or 32 or 64 ... => r=0, col=2, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=1 or 33 or 65 ... => r=1, col=2, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=2 or 34 or 66 ... => r=2, col=2, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=3 or 35 or 67 ... => r=3, col=2, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=4 or 36 or 68 ... => r=4, col=2, => r>>col = 1 => (r>>col)&1 = 1

        Example: col=0 or 32 or 64 ... => r=0, col=3, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=1 or 33 or 65 ... => r=1, col=3, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=2 or 34 or 66 ... => r=2, col=3, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=3 or 35 or 67 ... => r=3, col=3, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=4 or 36 or 68 ... => r=4, col=3, => r>>col = 0 => (r>>col)&1 = 0
        Example: col=5 or 37 or 69 ... => r=5, col=3, => r>>col = 0 => (r>>col)&1 = 0

        it is a smart way to generate the sequences like:
        010101010101010101010101010101010101010101010
        001100110011001100110011001100110011001100110
        000011110000111100001111000011110000111100001
        000000001111111100000000111111110000000011111
        000000000000000011111111111111110000000000000
        """
        for row in xrange(f):
            #print r>>row
            nb[row][col] = (r >> row) & 1
    """
    The join() method takes all items in an iterable and joins them into one string.
    A string must be specified as the separator.

    The str() function converts the specified value into a string.
    Hence, here, all nb elements (values 0 or 1 as integers) are converted to string and appended one after the other as strings.
    Result is printed on stdout.
    This operation is repeated f times (as per the exercise assignment values for f)

    """        
    for row in xrange(f):
        print "".join(map(str, nb[row]))
    
    """
    Here sys is used, to flush the f lines
    """
    sys.stdout.flush()

    """
    =================================================================================================
    Process string returned and find out broken workers.
    =================================================================================================
    """
    returnedFromStore = [map(int, raw_input()) for __ in xrange(f)]
    #print returnedFromStore

    want = 0
    bads = []
    idx = 0
    length = len(returnedFromStore[0])

    """
    For example: returnedFromStore=[[1, 0, 1, 0], [0, 1, 1, 0]]
    suppose n=5, f=2

    returnedFromStore can be seen as:
    [
     [1, 0, 1, 0]
     [0, 1, 1, 0]
    ]
    length=4
    """
    for col in xrange(n):
        r = 0
        for row in xrange(f):
            if idx < length:
                """
                want = 0
                col = 0
                row = 0
                idx = 0
                returnedFromStore[0][0] = 1 => 1 << 0 = 1 => r = 1|1 => r=1
                1 != 0 or 0 != 4 => bads = [0] want = 1
                
                want = 1
                col = 0
                row = 1
                idx = 0
                returnedFromStore[1][0] = 0 => 0 << 0 = 0 => r = 1|0 => r=1
                r != 1 or 0 == 4 => idx = 1 want = 2
                """

                r |= (returnedFromStore[row][idx]) << row

        if r != want or idx == length:
            bads.append(col)
        else:
            idx += 1

        want = (want + 1) & 31

    print ' '.join(map(str, bads))
    sys.stdout.flush()

    """
    Take the result and go on with next test
    """
    raw_input()

    """
    =================================================================================================
    Main.
    =================================================================================================
    """
for __ in xrange(t):
    solve()