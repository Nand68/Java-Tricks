HashMap<Integer,Integer> map = new HashMap<>();
// getOrDefault
map.put(key,map.getOrDefault(key,0)+1);

for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            entry.getKey();
            entry.getValue();
}


for (Integer key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}


for (Integer value : map.values()) {
    System.out.println(value);
}

