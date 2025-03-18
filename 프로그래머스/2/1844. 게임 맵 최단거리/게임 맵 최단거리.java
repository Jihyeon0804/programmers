import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        return bfs(maps, maps.length, maps[0].length);
    }
    
    public static int bfs (int[][] maps, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        
        // N S W E
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        
        queue.offer(new int[]{0, 0});  // 시작 위치 (0, 0)
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            // 현재 위치가 상대 팀 진영의 위치일 경우
            if (x == n - 1 && y == m - 1) return maps[x][y];
            
            // N S W E 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1;      // 위치에 이동 거리 저장
                    queue.offer(new int[]{nx, ny});     // 다음 이동 위치 추가
                }
            }
        }
            
        return -1;  // 도착 불가인 경우
    }
}