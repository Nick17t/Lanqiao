#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, m, sum = 0, minn = 999999;
vector<int> u, v, w, r, p, times;
int cmp(const int i, const int j){
	return w[i] < w[j];
} 
int find(int x){
	return p[x] == x ? x : p[x] = find(p[x]);
}
void Kruskal(){
	for(int i=1;i<=n;i++)	p[i] = i;	// ��ʼ�����鼯 
	for(int i=0;i<m;i++)	r[i] = i;	// ��ʼ�����
	sort(r.begin(), r.end(), cmp); 
	for(int i = 0; i < m; i++){
		int e = r[i];
		int x = find(u[e]), y = find(v[e]);
		if(x != y){
			sum +=  w[e];
			p[x] = y;
		}
	}
}
int main(){
	scanf("%d%d", &n, &m);
	u.resize(m), v.resize(m), w.resize(m), r.resize(m);
	p.resize(n+1);
	times.resize(n+1);
	for(int i=1;i<=n;i++){
		scanf("%d", &times[i]);
		minn = min(minn, times[i]);
	}
	for(int i=0;i<m;i++){
		int v1, v2, l;
		scanf("%d%d%d", &v1, &v2, &l);
		u[i] = v1, v[i] = v2;
		// ��ÿ���ߵ�Ȩֵ����Ϊ����Ȩֵ�Լ������ӵĶ��������ʱ��֮�� 
		w[i] = l*2 + times[v1] + times[v2];
	}
	Kruskal();
	printf("%d", sum + minn);
	return 0;
}
