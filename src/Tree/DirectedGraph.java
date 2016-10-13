package Tree;

import HashTable.HashTable;
import java.util.HashMap;
import java.util.HashSet;

public class DirectedGraph<T> {

    private HashMap<Node<T>, Node<T>> graph;

    public DirectedGraph(){
        graph = new HashMap<Node<T>, Node<T>>();
    }

    public void addVertex(T value){
        Node n = new Node(value);
        graph = addVertex(n, graph);
    }

    private HashMap<Node<T>, Node<T>> addVertex(Node<T> vertex, HashMap<Node<T>, Node<T>> graph){
        if(graph.containsKey(vertex)){
            return graph;
        }
        graph.put(vertex,vertex);
        return graph;
    }

    public void addEdge(Node<T> p, Node<T> c){
        graph = addEdge(p, c, graph);
    }

    private HashMap<Node<T>, Node<T>> addEdge(Node<T> parent, Node<T> child, HashMap<Node<T>,Node<T>> graph){
        if(graph.containsKey(parent)){ // Check to see if graph already contains the parent node
            Node<T> parentObject = graph.get(parent);
            if(!parentObject.children.contains(child)){ // if directed graph does not already contain an edge from parent to child, create one:
                parentObject.children.add(child);
                graph.put(graph.get(parent), parentObject);
            }
        }
        return graph;
    }

    public void deleteVertex(Node<T> vertex){
        graph = deleteVertex(vertex, graph);
    }

    private HashMap<Node<T>,Node<T>> deleteVertex(Node<T> vertex, HashMap<Node<T>,Node<T>> graph){
        if(graph.containsKey(vertex)){ // if graph does contain the vertex in question, remove it's references from all edges upon removal of the vertex itself:
            for(Node<T> key : graph.keySet()){
                HashSet<Node<T>> mutableChildren = graph.get(key).children;
                if(mutableChildren.remove(vertex)){
                    key.children = mutableChildren;
                    graph.put(key, key);
                }
            }
            graph.remove(vertex);
        }
        return graph;
    }
}
