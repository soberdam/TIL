# 목차
- [선형 자료구조](#선형-자료구조)
  - [배열](#배열)
  - [연결 리스트](#연결-리스트)
  - [스택](#스택)
  - [큐](#큐)
- [비선형 자료구조](#비선형-자료구조)
  - [트리](#트리)
    - [힙](#힙)
    - [이진 트리](#이진-트리)
    - [이진 탐색 트리](#이진-탐색-트리)
  - [그래프](#그래프)
  - [해싱](#해싱)
    - [해시테이블](#해시테이블)
    - [체이닝](#체이닝)

<br>

# 선형 자료구조

## 배열
![image](https://user-images.githubusercontent.com/106129404/229286302-c2cf7a47-c059-422d-9d56-74aed62179bb.png)

- 정해진 크기의 메모리를 먼저 할당받아 사용한다.
- 자료의 물리적 위치와 논리적 위치가 같다.
- index 연산이 가능하기 떄문에 i번째 원소를 탐색하는데에 O(1)의 상수시간이 소요된다.
- 구현이 간단하다.
- 삽입, 삭제에 O(n)의 시간이 소요된다.
- capacity가 정해져있기 때문에 오버헤드가 발생할 수 있고, 용량보다 원소의 갯수가 많으면 더 큰 용량의 배열을 생성하여 복사해야 한다.

## 연결 리스트
![image](https://user-images.githubusercontent.com/106129404/229286326-c32295df-e4ab-4f8f-b7e9-0385480bda98.png)

- 자료가 추가될 때마다 메모리를 할당받는다.
- 자료는 링크로 연결된다.
- 자료의 물리적 위치와 논리적 위치가 다를 수 있다.
- 배열에 비해 자료의 삽입과 삭제에 드는 시간이 적다.
- 자료의 이동이 빈번한 경우에 용이하다.
- index 연산이 불가능하기 때문에 처음부터 탐색해야 한다.

## 스택
![image](https://user-images.githubusercontent.com/106129404/229286435-a4789e9d-bbb3-494e-94a3-5c0b330c6f32.png)

- 가장 나중에 입력된 자료가 먼저 출력되는 후입선출(LIFO) 구조

## 큐
![image](https://user-images.githubusercontent.com/106129404/229286442-682feecd-470f-49c2-86da-5f8f7be964aa.png)

-  가장 먼저 입력된 자료가 먼저 출력되는 후입선출(LIFO) 구조

<br>

# 비선형 자료구조

## 트리
- 부모 노드와 자식 노드로 연결된 자료구조

### 힙
- 우선순위 큐(Priority Queue)를 구현하는 데 사용
- 최대힙 : 부모노드는 자식노드보다 크거나 같다.
- 최소힙 : 부모노드는 자식노드보다 작거나 같다.

### 이진 트리
![image](https://user-images.githubusercontent.com/106129404/229287254-e1af091f-3e2d-4b52-ac50-b7277bba9db0.png)

- 부모노드에 자식노드가 두개 이하인 트리

### 완전 이진 트리

### 포화 이진 트리

### 이진 탐색 트리
![image](https://user-images.githubusercontent.com/106129404/229287257-21346755-4165-457b-b0dc-7efefec26c7f.png)

- 자료의 중복을 허용하지 않음 (key의 유일성)
-  왼쪽 자식 노드는 부모 노드보다 작은 값, 오른쪽 자식 노드는 부모 노드보다 큰 값
-  자료 검색에 걸리는 평균 시간이 O(log n)
-  중위순회 시 자료가 정렬되어 출력됨

## 그래프
![image](https://user-images.githubusercontent.com/106129404/229287644-caf2cf76-70eb-4e49-974b-bbcb281833d8.png)

- 정점과 간선들의 유한 집합
- 정점(vertex) : 여러 특성을 가지는 객체, 노드
- 간선(edge) : 정점들의 연결 관계, 링크
- 간선은 방향성이 있는 경우와 없는 경우가 있음
- 그래프를 구현하는 방법 : 인접 행렬(adjacency matrix), 인접 리스트(adjacency list)
- 그래프를 탐색하는 방법 : BFS(bread first search), DFS(depth first search)

## 해싱
- 자료를 검색하기 위한 자료구조
- 키(key)에 대한 자료를 검색하는 사전(dictionary) 개념의 구조
- 유일한 key에 대응하는 value(값)을 쌍으로 저장
- index = h(key) : 해시 함수가 key에 대한 인덱스를 반환해준다. 해당 인덱스 위치의 자료를 저장하거나 검색할 때 사용한다.
- 해시 함수로 index 연산을 할 수 있기 때문에 O(1)의 상수시간에 탐색 가능
- jdk 클래스 : HashMap, Properties

### 해시테이블
![image](https://user-images.githubusercontent.com/106129404/229288468-3bc0a8cd-1847-4b97-9d00-b536de132d2d.png)

- 해시 함수를 이용하여 자료가 저장되는 메모리 구조
- jdk는 75%정도의 load balance를 유지. 이를 초과하면 테이블의 크기를 늘린다.
- 이는 collison 발생 시 오버헤드가 발생할 수 있기 때문이다.

### 체이닝
![image](https://user-images.githubusercontent.com/106129404/229288523-dd2c13f7-e54c-4489-a19c-2892bfeaa230.png)

- key값에 해당하는 index 옆에 자료들을 연결리스트로 연결

