(defproject timewarrior/clj-oauth2 "0.5.0"
  :description "clj-http and ring middlewares for OAuth 2.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.1.1"]
                 [clj-http "0.5.6"]]
  :dev-dependencies [[ring "1.1.5"]
                     [com.stuartsierra/lazytest "1.2.2"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"}
  :aot [clj-oauth2.OAuth2Exception clj-oauth2.OAuth2StateMismatchException])
