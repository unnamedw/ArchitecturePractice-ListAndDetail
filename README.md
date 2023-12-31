# ArchitecturePractice



# 

## 구조
![flowchart](https://github.com/unnamedw/EliceAcademyClone/assets/56429036/891af422-38b2-416f-9c8f-6d94da59484e)
FlowChart

기본적인 구조는 [권장 아키텍처](https://developer.android.com/topic/architecture?hl=ko) 를 따르고 있습니다.

- 로컬 저장소의 경우 간단한 구현을 위해 SharedPreferences를 사용하였습니다.
- DI의 경우 Hilt 대신 Manual DI Container를 만들어 의존성을 주입하였습니다.

**UI Layer** : 비즈니스 로직을 캡슐화한 경우엔 usecase를 참조하고 있으며, 특별히 비즈니스 로직을 분리해야 할 필요가 없는 경우 직접 repository를 참조하는 형태입니다.

**Domain Layer** : 다른 계층에 대해서 직접적인 의존성 및 Android의 의존성을 가지지 않게 설계하였습니다.

서비스의 비즈니스 모델과 repository, usecase로 나누어집니다.

**Data Layer** : 크게 RemoteDataSource와 LocalDataSource로 나누어지며, SSOT 원칙을 준수하기 위해 데이터의 참조는 모두 Repository를 통해 이루어집니다.


## Git

보통 main, develop, feature, release, hotfix의 형태로 브랜치를 나누어 사용합니다.

다만, 본 프로젝트에서는 빠른 작업 진행을 위해 일부 feature를 제외하고는 develop 브랜치에 직접 commit하는 방식으로 작업하였습니다.
