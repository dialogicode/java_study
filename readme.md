## 소프트웨어 개발 과정
	- 요구사항 분석
	- 설계 -> 올바르고 효과적으로 설계하기 위해 디자인 패턴을 적용하는 하는 것이 유용
	- 구현
	- 테스트

## 디자인 패턴
	소트웨어 설계 방법
	반복되는 패턴처럼 자주 나타나는 클래스 간의 관계를 맺는 방법

### 올바른 관계를 맺어야 하는 이유
	1. 클래스는 최소한의 단위 기능을 가짐
	2. 큰 기능은 이러한 단위 기능을 갖는 클래스들 간의 관계를 통해 개발됨
	3. 꼭 필요한 것들만으로 구성된 최적화된 소프트웨어 개발이 용이
	4. 문제 발생 시 최소한의 코드 수정으로 유지보수가 용이
	5. 기존 기능에 영향을 주지 않고 새로운 기능 추가가 용이

### GoF 디자인 패턴
	- 가장 유용하며 대표적인 디자인 패턴
	- 4명의 선배 개발자(Gang of Four)가 체계적으로 정리해놓은 설계 방법
	- 클래스 간의 최적의 관계를 매우 효과적으로 설계할 수 있는 하나의 사례
	- 설계에 반드시 적용할 필요없고 이해가 중요

### GoF 디자인 패턴 분류

	- 생성 패턴 (5개) : 생성 패턴은 단일 객체 또는 관련 객체 그룹을 인스턴스화하는 방법을 제공한다
		Abstract Factory
		Builder
		Factory Method
		Prototype
		Singleton

	- 구조 패턴 (7개) : 구조 패턴은 클래스 또는 객체 간의 관계를 정의하는 방법을 제공한다
		Adapter
		Bridge
		Composite
		Decorator
		Facade
		Flyweight
		Proxy

	- 행위 패턴 (11개) : 행위 패턴은 클래스와 객체 간의 통신 방법을 정의한다
		Chain of Responsibility
		Command
		Interpreter
		Iterator
		Mediator
		Memento
		Observer
		State
		Strategy
		Template Method
		Visitor