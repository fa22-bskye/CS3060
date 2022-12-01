import Data.List

--data Song = Title | Length | Name deriving (Show, Eq)
type Songs = (String, Double, String)
type Album = [Songs]

song1 = ("another day", 290.2, "PC")
song2 = ("leaving on a", 310.4, "JD")
song3 = ("country roads", 297.3, "JD")
song4 = ("Mary on a Cross", 333.3, "SB")
song5 = ("Life Eternal", 3.27, "SB")
song6 = ("Mr. Roboto", 4.60, "SX")

theAlbum = [song1, song2, song3]
anotherAlbum = [song4, song5]

contains::(Songs,Album) -> Bool
contains (s, []) = False
contains (s, (h:t))
    | s == h = True
    | otherwise = contains (s,t)

