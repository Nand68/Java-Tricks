
class Edge {
  int src, dest, weight;

  Edge(int src, int dest, int weight) {
    this.src = src;
    this.dest = dest;
    this.weight = weight;
  }
}

static List<Edge> edges = new ArrayList<>();
// Sort edges based on weight using a custom comparator
Collections.sort(edges, new Comparator<Edge>() {
  public int compare(Edge e1, Edge e2) {
    return Integer.compare(e1.weight, e2.weight);
  }
});

// Also can write like this 
 Collections.sort(edges, (e1, e2) -> Integer.compare(e1.weight, e2.weight));

// for decresing order 
Collections.sort(edges, (e1, e2) -> Integer.compare(e2.weight, e1.weight));
