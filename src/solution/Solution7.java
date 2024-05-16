package solution;

import java.util.*;


class node{
    int prior;
    int loc;

    public node(int prior, int loc) {
        this.prior = prior;
        this.loc = loc;
    }
}

public class Solution7 {
    public int solution(int[] priorities, int location) {
        LinkedList<node> prior = new LinkedList<node>();
        int cnt = 0;
        int answer = 0;
        for (int i = 0; i < priorities.length; i++) {
            prior.add( new node( priorities[i], i ));
        }
        while (!prior.isEmpty()) {
            node f = prior.getFirst();
            int k = 0;
            for (k = 0; k < prior.size(); k++) {
                node find = prior.get( k );
                if (find.prior > f.prior) {
                    prior.poll();
                    prior.addLast( f );
                    break;
                }
            }
            if (k == prior.size()) {
                prior.poll();
                cnt++;
                if (f.loc == location) {
                    answer = cnt;
                    return answer;
                }
            }

        }
        return answer;
    }
}
