# Cucumber JVM Hybrid Example

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


