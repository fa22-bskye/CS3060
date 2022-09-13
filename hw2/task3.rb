require 'benchmark'

Benchmark.bm do |x|
 
    x.report('3A') { 
        def Function3A (max)
        if max == 1
            return 1
        elsif max == 2
             return 1
        else
            return (Function3A(max - 1) + Function3A(max - 2))
        end
    end
    }

    x.report('3B') {
        def Function3B (num)
        if num < 2
            num
        else
            Function3B(num - 1) + Function3B(num - 2)
         end
    end
    }
end 



p Function3A(38) #Iteration
p Function3B(38)    #Recursion