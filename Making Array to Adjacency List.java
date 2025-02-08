// Making Array to Adjacency List for 2d array with 3 values
ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
for(int i = 0; i < V; i++) {
    edges.add(new ArrayList<>());
}
        
// Add edges
for(int i = 0; i < arr.length; i++) {
    ArrayList<Integer> edge = new ArrayList<>();
    edge.add(arr[i][0]);  // source
    edge.add(arr[i][1]);  // destination
    edge.add(arr[i][2]);  // weight
    edges.add(edge);
}

// other way 
ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
// Convert edge array to list
for (int[] edge : arr) {
    ArrayList<Integer> currentEdge = new ArrayList<>();
    currentEdge.add(edge[0]);  // source
    currentEdge.add(edge[1]);  // destination
    currentEdge.add(edge[2]);  // weight
    edges.add(currentEdge);
}
