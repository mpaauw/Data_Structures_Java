// Data_Structures_Java
//
// Author: Matt Paauw
// GitHub: https://github.com/adjutant-xx
//
// No license, free use

package Tree;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.ArrayList;

/*
* SUMMARY:  Represents a single node, or vertex, within a Graph data structure.
* */
public class GraphNode<T> extends TreeNode<T> {
    private ArrayList<GraphNode<T>> _children;
    private boolean _visited;

    public GraphNode(T d){
        this.setData(d);
        _children = new ArrayList<GraphNode<T>>();
        _visited = false;
    }

    public ArrayList<GraphNode<T>> getChildren(){
        return _children;
    }

    public void addChild(GraphNode<T> newChild){
        _children.add(newChild);
    }

    public boolean getVisitState(){
        return _visited;
    }

    public void setVisitState(boolean state){
        _visited = state;
    }
}
