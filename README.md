# Cucumber JVM Hybrid Example

# ARCHIVED

This puppy was an old example. It might still be useful to some, so I'm just gonna archive it. Know that Cucumber-jvm has evolved much since this was written
and the examples here might not help you any more! Good Luck!

Unfortunately something in travis doesn't like this, and I cannot reproduce it locally. Also I'm not sure anyone would ever
do their cucumber-jvm builds this way, I probably wouldn't any more. I'm not going to worry about the build failing right now.
Pull requests accepted!

[![Build Status](https://travis-ci.org/dkowis/cucumber-jvm-hybrid-example.svg?branch=master)](https://travis-ci.org/dkowis/cucumber-jvm-hybrid-example)

This project's purpose is to provide an example that uses multiple backends and proves that they work together.

## Interesting behavior to note

Hooks are run regardless of the language the step definition is executed in. So the java step definition hooks are executed
after all of the ruby scenarios. As well as the before hooks. *All* hooks regardless of which language context are run.'

Be sure to write your hooks in a way that behaves well if none of the scenario was executed that you intend the hooks to
operate around

## Jruby Notes

This project uses the Jruby backend, and the java backend currently. More backends can be added if desired.

To set up the jruby part of the project, you need to run `mvn initialize -Pinitial-bundle` to properly install the bundler gem
and set up a default Gemfile.

Then you should add the src/test/gems directory and commit it. After that you should add the src/test/gems directory
to .gitignore so you don't add any more gems.

Now you can treat the Gemfile and Gemfile.lock as files to be committed to your repo, and any time someone runs the tests
the bundle install will be run, and that will make sure you always have the gems available for testing, and that any
updated gems are acquired and downloaded, but don't pollute your repo.
