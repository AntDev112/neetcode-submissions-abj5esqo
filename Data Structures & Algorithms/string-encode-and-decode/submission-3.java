class Solution {

public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
        sb.append(str.length()).append('#').append(str);
    }
    return sb.toString();
}
public List<String> decode(String str) {
    int j = 0;
    List<String> result = new ArrayList<>();
    while (j < str.length()) {
        int sepIndex = str.indexOf('#', j); // search from j directly
        int size = Integer.parseInt(str.substring(j, sepIndex));
        result.add(str.substring(sepIndex + 1, sepIndex + 1 + size));
        j = sepIndex + 1 + size;
    }
    return result;
}
}
