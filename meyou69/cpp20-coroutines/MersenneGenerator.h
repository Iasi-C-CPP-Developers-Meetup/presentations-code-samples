#pragma once

#include <coroutine>
#include <utility>

class MersenneGenerator
{
public:
    struct promise_type
    {
        MersenneGenerator get_return_object()
        {
            return MersenneGenerator{this};
        }

        static std::suspend_always initial_suspend() noexcept
        {
            return {};
        }

        static std::suspend_never final_suspend() noexcept
        {
            return {};
        }

        std::suspend_always yield_value(unsigned long long value)
        {
            current_value = std::move(value);
            return {};
        }

        std::suspend_always return_value(unsigned long long value)
        {
            return_val = value;
            return {};
        }

        // Disallow co_await in generator coroutines.
        void await_transform() = delete;

        [[noreturn]]
        static void unhandled_exception()
        {
            throw;
        }

        unsigned long long current_value;
        unsigned long long return_val;
    };

    std::coroutine_handle<promise_type> handle;

    explicit MersenneGenerator(promise_type *pt) : handle{std::coroutine_handle<promise_type>::from_promise(*pt)} {}

    ~MersenneGenerator()
    {
        if (handle)
        {
            handle.destroy();
        }
    }

    unsigned long long GenerateNext();
};