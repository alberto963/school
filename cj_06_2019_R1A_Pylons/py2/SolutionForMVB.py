from sys import stdin
from collections import defaultdict
from itertools import product
from __builtin__ import set

"""
Given a set of cells in the graph (xs) and the dictionary of the edges,
finds the cell with the lowest degree (that is the best choice),
i.e. the cell that has less valid edges (the first one found)
"""
def best(xs, X):
  b = None
  for x in xs:
    print "x=", x
    if b is None or len(X[x]) < len(X[b]):
      b = x
  return b

def path():
  R, C = (int(a) for a in next(stdin).strip().split(" "))
  # defaultdict
  """
  A defaultdict works exactly like a normal dict,
  but it is initialized with a function ("default factory")
  that takes no arguments and provides the default value for a nonexistent key.
  A defaultdict will never raise a KeyError.
  Any key that does not exist gets the value returned by the default factory.
  """
  # set
  """
  Set, a term in mathematics for a sequence consisting of distinct language
  is also extended in its language by Python and can easily be made using set().
  set() method is used to convert any of the iterable to sequence of iterable elements with distinct elements, commonly called Set.
  """
  X = defaultdict(set)
  # product
  """
  Cartesian product of input iterables. Equivalent to nested for-loops.
  For example, product(A, B) returns the same as:  ((x,y) for x in A for y in B).
  The leftmost iterators are in the outermost for-loop, so the output tuples
  cycle in a manner similar to an odometer (it: 'contachilometri') (with the rightmost element changing on every iteration).
  """
  for (a,b) in product(range(R), range(C)):
    for (x,y) in product(range(a), range(C)):
     
      if a == x: continue
      if b == y: continue
      if (a - b) == (x - y): continue
      if (a + b) == (x + y): continue
      print "(a,b)=", (a, b)
      print "(x,y)=", (x, y)
      """
      For every cell, add all valid edges
      """
      X[(a,b)].add((x,y))
      X[(x,y)].add((a,b))
  """
  For case R=2 and C=5 we have:
  
  X = {(1, 2): set([(0, 0), (0, 4)]),
       (0, 1): set([(1, 3), (1, 4)]),
       (0, 0): set([(1, 2), (1, 3), (1, 4)]),
       (0, 3): set([(1, 0), (1, 1)]),
       (0, 2): set([(1, 0), (1, 4)]),
       (1, 3): set([(0, 1), (0, 0)]), 
       (1, 4): set([(0, 1), (0, 0), (0, 2)]), 
       (0, 4): set([(1, 2), (1, 0), (1, 1)]), 
       (1, 0): set([(0, 3), (0, 2), (0, 4)]), 
       (1, 1): set([(0, 3), (0, 4)])})
  """
  print "X=", X
  """
  Find the first cell to start with, i.e. one of the cells with the lowest number of edges (the first one)
  For case R=2 and C=5 we have:
  loc = (0, 1) (because best functions iterates on all the couple starting from (0,0), ... (0,4), (1,0), ... (1,4)
  """
  loc = best(product(range(R), range(C)), X)
  print "loc=", loc
  """
  So Loc is the first one, an array of visited cells is prepared
  """
  path = [loc]
  
  """
  """
  for _ in range(1, R*C):
    nloc = best(X[loc], X)
    if not nloc:
      return None #?
  
    """
    A new one is found, hence remove the previous one loc from X dictionary for all couples with key loc in X dictionary
    """
    for x in X[loc]:
      X[x].remove(loc)
      
    """
    D.pop(k[,d]) -> v, remove specified key and return the corresponding value.
    If key is not found, d is returned if given, otherwise KeyError is raised
    
    Here it removes key loc as itis already been visited
    """
    X.pop(loc, None)
    """
    current loc is now the new loc, add it to the visited cells array
    """
    loc = nloc
    path.append(loc)
    
  return path
  
"""
Output
"""
T = int(next(stdin))
for t in range(T):
  r = path()
  if not r:
    print("Case #%d: IMPOSSIBLE" % (t + 1))
  else:
    print("Case #%d: POSSIBLE" % (t + 1))
    for x,y in r:
      print("%d %d" % (x+1,y+1))
