# Project

## 버전관리 시스템 설치 DVCS(git)
- https://nvie.com/posts/a-successful-git-branching-model/
- git 설치 : $brew install git
- git-flow 설치 : $brew install git-flow 
- git init : $git flow init -d

### git-flow 브랜치 종류 정의
- master, develop :  메인 브랜치
- master : 사용자에게 배포되는 Stable 브랜치
- develop : 다음 릴리즈를 위해 기능들을 모으는 최신 브랜치, 통합 브랜치, 개발 진행 브랜치
- feature : 특정 기능 개발을 위한 브랜치
- release/bugfix : 릴리즈를 위해 버그 픽스(Bug fix)를 모으는 브랜치
- hotfix : 긴급 버그 픽스를 위한 브랜치
- support : 버전 호환성 문제를 위한 브랜치

### git-flow 사용법
1. develop pull
2. git-flow feature create - develop 브랜치 기반으로 생성
- 시작 : $git flow feature start [feature name]
- 종료 : $git flow feature finish [feature name]
- 원격 저장소 push : $git flow feature publish [feature name]
- 원격 저장소 pull : $git flow feature pull origin [feature name]
3. feature -> develop merge
4. develop pull
5. git-flow release create - develop 브랜치 기반으로 생성
- 시작 : $git flow release start [version]
- 원격 저장소 push : $git flow release publish [version]
- 원격 저장소의 변경 사항을 가져올시(pull 대신 사용하길 권장) : $git flow release track [version]
- 종료 : $git flow release finish [version]
5. release -> master merge
6. release 버전을 태그로 생성한다. 이 때, git flow init 에서 명시한 Version tag prefix 문자열이 release버전 앞에 추가되어 태그로 생성된다.
7. release -> develop merge
8. release delete
9. git-flow hotfix create - master 브랜치 기반으로 생성
- 시작 : $ git flow hotfix start [version]
- 종료 : $ git flow hotfix finish [version]
10. hotfix -> master merge
11. hotfix 버전을 태그로 생성한다. 마찬가지로 git flow init 에서 명시한 Version tag prefix 문자열이 hotfix 버전 앞에 추가되어 태그로 생성된다
12. hotfix -> develop merge
13. hotfix delete

### git commit 유형지정
- FEAT : 새로운 기능의 추가
- FIX: 버그 수정
- DOCS: 문서 수정
- STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
- REFACTOR: 코드 리펙토링
- TEST: 테스트 코트, 리펙토링 테스트 코드 추가
- CHORE: 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)

## Framework
### SpringBoot 2.4.0
### Java 8
### Gradle
### JPA
### GraphQL

## DB
### Docker mariaDB

### Tools : sourcetree, insomnia, IntelliJ IDEA, MysqlWorkbench

