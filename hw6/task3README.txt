Output:

ghci> contains (song2, theAlbum)
True
ghci> contains (song4, theAlbum)
False

ghci> contains (song4, anotherAlbum)
True

task3 for hw6 in Haskell
data type Songs is held in Album.
theAlbum holds the required 3 songs.
Function contains was written to search for a
song in a certain album, returns a bool depending
on such.

anotherAlbum was created with song4 and song5 to test
searching in another album.

6 songs were initialized for testing purposes.