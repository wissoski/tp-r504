import pytest
import fonctions as f

def test1():
    assert f.puissance(2,3) == 8
    assert f.puissance(2,2) == 4

def test_exception():
   with pytest.raises(Exception):
       f.puissance(0, -1)

def test2():
   assert f.puissance(-1, 2) == 1
   assert f.puissance(-1, 3) == -1
   assert f.puissance(-1, -1) == -1
   assert f.puissance(-2, -1) == -0.5

