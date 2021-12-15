try {
	stage("Building SONAR ...") {
		sh './gradlew clean sonarqube'
	}
} catch (e) {
	step([$class: 'WsCleanup'])
		return
}
