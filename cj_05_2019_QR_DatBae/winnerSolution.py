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
"""
"""
	The map() function executes a specified function for each item in a iterable.
	The item is sent to the function as a parameter.
"""
"""...Here it reads three params n b and f from the std in
""" 
    n,b,f = map(int, raw_input().split())

"""
=================================================================================================
Generate TEST_STORE sequences of bits.
=================================================================================================
"""
"""
The xrange() function in Python is used to generate a sequence of numbers, similar to the range() function.
However, xrange() is used only in Python 2.x whereas range() is used in Python 3.x.
"""
    nb = [[0 for __ in xrange(n)] for ___ in xrange(f)]
    for i in xrange(n):
        r = i & 31
        for j in xrange(5):
            nb[j][i] = (r>>j)&1
    for j in xrange(5): print "".join(map(str,nb[j]))
    sys.stdout.flush()

"""
=================================================================================================
Process string returned and find out broken workers.
=================================================================================================
"""
    bs = [map(int, raw_input()) for __ in xrange(5)]
    want = 0
    bads = []
    idx = 0
    for i in xrange(n):
        r = 0
        for j in xrange(5):
            if idx < len(bs[j]):
                r |= (bs[j][idx]) << j
        if r != want or idx == len(bs[j]):
            bads.append(i)
        else:
            idx += 1
        want = (want + 1) & 31

    print ' '.join(map(str, bads))
    sys.stdout.flush()
    raw_input()

"""
=================================================================================================
Main.
=================================================================================================
"""
for __ in xrange(t):
    solve()