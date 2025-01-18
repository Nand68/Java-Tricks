class Pair{
    int cost;
    int i;
    int j;
    Pair(int cost ,int i, int j){
        this.cost = cost;
        this.i = i;
        this.j = j;
    }
}
PriorityQueue<Pair> p = new PriorityQueue<>((a,b) -> Integer.compare(a.cost,b.cost));
// here we can see we add pair in queue and do min heap by cost  Integer.compare
