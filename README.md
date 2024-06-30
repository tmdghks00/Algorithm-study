# Baekjoon-study

백준 코딩테스트 입력받을때 꿀팁 >>
1번 입력방법(버퍼드리더) ⇒  속도가 스캐너보다 빨라서 좋음

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer(br.readLine());**

for (int i = 0; i < n; i++) {

nums[i] = Integer.parseInt(st.nextToken());

}

2번 입력방법(스캐너)⇒ 속도가 느림

Scanner in = new Scanner(System.*in*);
