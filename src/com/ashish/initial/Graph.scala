package com.ashish.initial

/**
  * Implementation of a Graph with an included list of Nodes.
 * Created by ash on 7/13/16.
 */
class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes // Put node in the connectedNodes collection.

      }
    }
  }// End of the Node class

  var nodes: List[Node] = Nil
  // define a new Node in the Graph.
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes  // Put res in Nodes collection.
    res
  }
}

object GraphTest extends App {
  val g = new Graph
  // the node is viewable from the outer Object and not just from the inner class.
  val n1 = g.newNode
  val n2 = g.newNode
  val n3 = g.newNode
  // Again the same thing here.. the nodes are viewable from outside the context of he outer class.
  n1.connectTo(n2)
  n3.connectTo(n1)
  println("Completed")
}
