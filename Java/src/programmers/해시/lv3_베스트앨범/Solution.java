package programmers.해시.lv3_베스트앨범;

import java.util.*;

class Music implements Comparable<Music> {
    int id;
    int play;

    public Music(int id, int play) {
        this.id = id;
        this.play = play;
    }

    @Override
    public int compareTo(Music o) {
        return o.play - this.play;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        List<Integer> rList = new ArrayList<>();
        HashMap<String, List<Music>> listMap = new HashMap<>();
        HashMap<String, Integer> totalPlay = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 장르별 재생된 수 구하기
            totalPlay.put(genre, totalPlay.getOrDefault(genre, 0) + play);

            List<Music> musicList;
            if (!listMap.containsKey(genre)) {
                musicList = new ArrayList<>();
            } else {
                musicList = listMap.get(genre);
            }
            musicList.add(new Music(i, play));
            listMap.put(genre, musicList);
        }

        // 많이 재생된 장르 구하기(정렬)
        List<String> genresSortList = new ArrayList<>(totalPlay.keySet());
        genresSortList.sort((o1, o2) -> (totalPlay.get(o2).compareTo(totalPlay.get(o1))));

        for (String genre : genresSortList) {
            List<Music> musicList = listMap.get(genre);
            Collections.sort(musicList);

            int cnt = 0;
            for (Music music : musicList) {
                rList.add(music.id);
                cnt++;
                if (cnt == 2) {
                    break;
                }
            }
        }

        int[] answer = new int[rList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = rList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        T.solution(genres, plays);
    }
}
