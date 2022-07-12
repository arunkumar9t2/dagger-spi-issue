package dev.arunkumar.spi.plugin

import com.google.auto.service.AutoService
import dagger.model.BindingGraph
import dagger.spi.BindingGraphPlugin
import dagger.spi.DiagnosticReporter

@AutoService(dagger.spi.BindingGraphPlugin::class)
class DaggerPlugin : BindingGraphPlugin {
    override fun visitGraph(
        bindingGraph: BindingGraph,
        diagnosticReporter: DiagnosticReporter
    ) {
        print("Visiting :" + bindingGraph.rootComponentNode().componentPath().toString())
    }
}