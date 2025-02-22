/*
 * Created by Konstantin Tskhovrebov (aka @terrakok)
 */

package ru.terrakok.cicerone;

import org.jetbrains.annotations.NotNull;

import ru.terrakok.cicerone.commands.Command;

/**
 * BaseRouter is an abstract class to implement high-level navigation.
 * Extend it to add needed transition methods.
 */
public abstract class BaseRouter {
    private CommandBuffer commandBuffer;

    public BaseRouter() {
        this.commandBuffer = new CommandBuffer();
    }

    @NotNull
    CommandBuffer getCommandBuffer() {
        return commandBuffer;
    }

    /**
     * Sends navigation command array to {@link CommandBuffer}.
     *
     * @param commands navigation command array to execute
     */
    protected void executeCommands(@NotNull Command... commands) {
        commandBuffer.executeCommands(commands);
    }
}
