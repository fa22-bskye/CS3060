class Shape
    attr_accessor :color, :resultArea
    def initialize(color)
        @color = color
    end
end

class Octagon < Shape
    attr_accessor :side 
    def initialize(color)
        super
        @side = 2.0
        Octagon(@side)
    end
    def Octagon(side)
        @resultArea = 2 * (side)**2 * (1 + Math.sqrt(2)) 
        
    end
    def area()
        resultArea 
    end

end

class Hexagon < Shape
    attr_accessor :side
    def initialize(color)
        super
        @side = 3.0
        Hexagon(@side)
    end

    def Hexagon(side)
        @resultArea = (3 * Math.sqrt(3)) / 2 * (side)**2
    end

    def area()
         resultArea
    end
end

list = []
for i in 0..50
    choice = rand(2)

    if choice == 0
        o = Octagon.new("blue")
        list.push(o)
    else
        h = Hexagon.new("blue")
        list.push(h)
    end
end

list.each{|shapes| p shapes.area}


