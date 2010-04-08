(defproject sandbar/sandbar "0.2.2"
  :description "Clojure web application library built on top of Ring
                and Compojure."
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-master-SNAPSHOT"]
                 [compojure "0.4.0-SNAPSHOT"]
                 [hiccup "0.2.3"]
                 [ring/ring-jetty-adapter "0.2.0"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]
                     [ring/ring-devel "0.2.0"]
                     [ring/ring-httpcore-adapter "0.2.0"]
                     [ring/ring-servlet "0.2.0"]
                     [mysql/mysql-connector-java "5.1.6"]
                     [mstate "0.0.1-SNAPSHOT"]]
  :namespaces [sandbar.core
               sandbar.auth
               sandbar.stateful_session
               sandbar.dev.basic_authentication
               sandbar.dev.database
               sandbar.dev.forms
               sandbar.dev.html
               sandbar.dev.list_manager
               sandbar.dev.standard_pages
               sandbar.dev.tables
               sandbar.dev.stats
               sandbar.dev.userui
               sandbar.dev.util])
