# Git 명령어

- `git config [user.name](http://user.name) "유저이름"` : 사용자 이름 설정
- `git config [user.email](http://user.email) "이메일 주소"` : 사용자 메일 설정
- `git init` : 해당 디렉토리를 깃으로 관리 시작
- `git status` : 디렉토리의 상태를 git의 관점에서 보여줌
- `git add "파일명"` : 스테이지에 commit할 파일을 add
- `git add .` : 디렉토리의 모든 파일을 add
- `git commit` : 스테이지에 add된 파일들을 commit. Vi 입력 모드로 진입.

| 작업 | Vi 명령어 | 상세 |
| --- | --- | --- |
| 입력 시작 | i | 명령어 입력 모드에서 텍스트 입력 모드로 전환 |
| 입력 종료 | ESC | 텍스트 입력 모드에서 명령어 입력 모드로 전환 |
| 저장 없이 종료 | :q |  |
| 저장 없이 강제 종료 | :q! | 입력한 것이 있을 때 사용 |
| 저장하고 종료 | :wq | 입력한 것이 있을 때 사용 |
| 위로 스크롤 | k | git log등에서 내역이 길 때 사용 |
| 아래로 스크롤 | j | git log등에서 내역이 길 때 사용 |
- `git commit -m "커밋 메시지"` : 커밋 메시지와 함께 commit
- `git log` : 현재 브랜치의 커밋 로그 확인
- `git log --all` :모든 브랜치의 커밋 로그 확인
- `git log --all --decorate --oneline --graph`  : 모든 브랜치를 그래픽으로 보여줌
- `git diff` : 자세한 수정사항 확인

| 작업 | Vi 명령어 | 상세 |
| --- | --- | --- |
| 위로 스크롤 | k | git log등에서 내역이 길 때 사용 |
| 아래로 스크롤 | j | git log등에서 내역이 길 때 사용 |
| 끄기 | :q | :가 입력되어 있으므로 q만 눌러도 됨 |
- `git commit -am "커밋 메시지"` : add와 commit을 한번에
    - 단, **새로 추가된 untracked 파일이 없을 때만 사용가능**
- `git reset 커밋옵션 커밋해시` : 커밋 해시 상태로 초기화
    - 커밋 해시가 없으면 가장 최근 커밋으로 reset
- `git revert 커밋해시`
- `git revert --no-commit 커밋해시`
    - commit하지 않고 revert. revert는 적용되지만 add 된 상태
    - 원하는 다른 작업을 추가한 후 revert와 함께 커밋하고 싶을 때 사용
    - 취소하려면 `git reset --hard`
- `git branch` : 현재 존재하는 branch의 리스트를 보여줌
- `git branch -a` : 로컬과 원격의 branch까지 모두 보여줌
- `git branch "브랜치명"` : 브랜치 생성
- `git switch "브랜치명"` : 브랜치 이동
- `git switch -c "브랜치명"` : 브랜치 생성과 동시에 이동
- `git branch -d "브랜치명"` : 브랜치 삭제
- `git branch -D "브랜치명"` : 삭제할 브랜치에 고유한 커밋이 있는 경우 강제삭제
- `git branch -m "기존 브랜치명" "새 브랜치명"` : 브랜치 이름 변경
- `git merge "합칠 브랜치명"` : 현재 브랜치에 대상 브랜치를 merge
- `git rebase "합류할 브랜치명"` : 현재 브랜치를 합류할 브랜치로 rebase
- `git merge --abort` : 당장 충돌 해결이 어려울 경우 merge 중단
- `git rebase --abort` : 당장 충돌 해결이 어려울 경우 rebase 중단
- `git rebase --continue` : 충돌 해결 후 rebase를 재개한다.
- `git remote add origin (원격 저장소 주소)` : 로컬 git 저장소에 원격 저장소로 연결 추가
    - 원격 저장소 이름에 보통 origin 사용, 수정 가능
- `git branch -M main` : github에 권장, 기본 브랜치명을 main으로
- `git push -u origin main/branch명` : 로컬 저장소 내 main/branch의 커밋내역들을 원격저장소로 push하게 설정
    - 한번 설정한 이후에는 origin저장소의 main브랜치로 `git push` 하면 push됨
- `git remote (-v)` : 현재 로컬에 연결된 원격저장소 정보를 보여줌
- `git clone 원격저장소 주소` : (터미널이나 Git Bash에서 대상 폴더 이동 후) 원격 저장소에서 로컬 저장소로 깃의 관리 내역을 포함하여 복사
- `git push` : 로컬 저장소의 커밋을 원격 저장소로 밀어올리기
- `git pull` : 원격 저장소의 커밋을 로컬 저장소로 당겨오기
- `git pull --no-rebase` - **merge** 방식
- `git pull --rebase` - **rebase 방식**
    - pull 상의 rebase는 다름 (협업시 사용 OK)
- `git push --force` : 로컬의 내역 강제 push
- `git switch -t 원격저장소명/원격브랜치명` : 원격의 브랜치를 로컬에 생성하고 연결, switch
- `git push 원격저장소명 --delete 원격브랜치명` : 원격 브랜치를 제거
