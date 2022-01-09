package com.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class BlogApplication

@Configuration
@EnableConfigurationProperties(BlogProperties::class)
class BlogConfiguration {

	@Bean
	fun databaseInitializer(userRepository: UserRepository,
							articleRepository: ArticleRepository) = ApplicationRunner {

		val tifuseini = userRepository.save(User("Tifuseini", "Tahiru", "Fuseini"))
		val sosa = userRepository.save(User("sosa","Lebene","Jude"))
		articleRepository.save(Article(
			title = "Reac Bismuth is out",
			headline = "orem ipsum",
			content = "dolor it amet",
			author = tifuseini
		))
		articleRepository.save(Article(
			title = "Reactor Alumiium has landed",
			headline = "Lorem ipsm",
			content = "dolr sit amet",
			author = tifuseini
		))
		articleRepository.save(Article(
			title = "Reactor Alumnium has landed",
			headline = "Lore ipsum",
			content = "dolo sit amet",
			author = sosa
		))
		articleRepository.save(Article(
			title = "Reactor Aluminium has landed",
			headline = "Lorem ipsum",
			content = "dolor sit amet",
			author = sosa
		))


	}
}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
