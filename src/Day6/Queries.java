package Day6;

public class Queries {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int tmp = 0;

        for(int i = 0; i < queries.length; i++){
            tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }

        return arr;
    }
}

// Review
// queries.length : 행의 개수 출력
// queries[i].length : i행의 열 개수 출력