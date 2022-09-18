class Tree

    @@root = 0
    @@leaves = 0
    attr_accessor :children, :node_name

    def initialize(name, children)
        @children = children
        if children.empty?
            @@leaves += 1
        end
        @node_name = name; @@root += 1
    end




    def visit_all(&block)
        visit &block ; children.each {|c| c.visit_all   &block} 
    end 
    def visit(&block) 
        block.call  self
    end 

    def self.root
        @@root
    end
    def self.leaves
        @@leaves
    end
    
end

def make_root(theHash)
    iniNode(theHash.keys[0], theHash[theHash.keys[0]])
end

def iniNode(name, children)
    Tree.new(name, children.keys.collect{|h| iniNode(h, children[h])})
end

ruby_tree = make_root({
    'ggp' => {
        'gp1' => {'p1' => {'child1' => {}, 'child2' => {}} ,
        'p2' => {'child3' => {}}
    },
            'gp2' => {'p3' => {'child4' => {}} , 'p4' => {'child5' => {}, 'child6' => {}}
            },

            'gp3' => {'p5' => {'child7' => {}},
                 'p6' => {'child8' => {}}
            }
    }
})

ruby_tree.visit_all{|x| puts x.node_name}
puts

puts "#{Tree.root} nodes"
puts "#{Tree.leaves} children"


