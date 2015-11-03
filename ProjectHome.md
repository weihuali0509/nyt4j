A java driver for (a growing number of) The New York Times public APIs (http://developer.nytimes.com/docs).

[Most Popular API](http://developer.nytimes.com/docs/most_popular_api/)
```
MostPopularQuery mostPopularQuery = MostPopularQuery.getQuery(ResourceType.MOSTEMAILED, TimePeriod.THRITY);
List<Article> articles = MostPopularSearch.getInstance(apiKey).search(mostPopularQuery);
```

[Article Search API](http://developer.nytimes.com/docs/article_search_api/)
```
ArticleSearchQuery searchQuery = ArticleSearchQuery.getQuery("obama");
List<Article> articles = ArticleSearch.getInstance().search(searchQuery);
for(Article article : articles) {
     System.out.println(article.getTitle() + ": " + article.getAbstract());
}
```